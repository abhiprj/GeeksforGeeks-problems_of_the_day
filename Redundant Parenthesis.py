class Solution:
    def removeBrackets(self, a):
        s = []
        op = []
        n = len(a)
        del_list = [0] * n
        for i in range(n):
            c = a[i]
            if c.isalpha():
                continue
            if c == ')':
                addSub = False
                mulDiv = False
                if a[s[-1]] == '(':
                    del_list[i] = 1
                    del_list[s[-1]] = 1
                    s.pop()
                else:
                    while a[s[-1]] != '(':
                        d = a[s[-1]]
                        s.pop()
                        op.pop()
                        if d == '*' or d == '/':
                            mulDiv = True
                        else:
                            addSub = True
                    ind = s[-1]
                    s.pop()
                    if not op:
                        del_list[i] = 1
                        del_list[ind] = 1
                        continue
                    d = a[op[-1]]
                    if d == '+' or (d in ['*', '-'] and not addSub):
                        del_list[i] = 1
                        del_list[ind] = 1

            elif c == '(':
                s.append(i)
            else:
                s.append(i)
                op.append(i)

        ans = ""
        for k in range(n):
            if not del_list[k]:
                ans += a[k]

        return ans
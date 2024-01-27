class Solution:
    def search(self, A, l, h, key):
        while l <= h:
            mid = (l + h) // 2
            if A[mid] == key:
                return mid
            elif A[l] <= A[mid]:
                if A[l] <= key <= A[mid]:
                    h = mid - 1
                else:
                    l = mid + 1
            else:
                if A[mid] <= key <= A[h]:
                    l = mid + 1
                else:
                    h = mid - 1
        return -1
            
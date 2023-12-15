/* The structure of the class is
class QueueStack{
private:
    queue<int> q1;
    queue<int> q2;
public:
    void push(int);
    int pop();
};
 */

//Function to push an element into stack using two queues.
void QueueStack ::push(int num)
{
    while(!q1.empty())
    {
        q2.push(q1.front());
        q1.pop();
    }
    
    q1.push(num);
    
    while(!q2.empty())
    {
        q1.push(q2.front());
        q2.pop();
    }
}

int QueueStack ::pop()
{
    int answer = -1;
    if(!q1.empty())
    {
        answer = q1.front();
        q1.pop();
        return answer;
    }
    return answer;
}
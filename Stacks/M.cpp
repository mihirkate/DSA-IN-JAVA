#include <bits/stdc++.h>
#include <iostream>
#include <stack>
void solve(stack<int> &s, int count, int size)
{
    if (count == size / 2)
    {
        s.pop();
        return;
    }
    int num = s.top();
    s.pop();
    solve(s, count + 1, size);
    s.push(num);
}
void deleteMiddle(stack<int> &inputStack, int N)
{

    // Write your code here
    int count = 0;
    solve(inputStack, count, N);
}

void print(stack<int> s)
{
    stack<int> tempStack;
    while (!s.empty())
    {
        int element = s.top();
        cout << "  " << element;
        tempStack.push(element);
        s.pop();
    }
    cout << endl;

    while (!tempStack.empty())
    {
        s.push(tempStack.top());
        tempStack.pop();
    }
}
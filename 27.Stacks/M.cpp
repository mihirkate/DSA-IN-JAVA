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
    return;
}
void deleteMiddle(stack<int> &inputStack, int N)
{

    // Write your code here
    int count = 0;
    solve(inputStack, count, N);
}

stack<int> Add(stack<int> stack1, stack<int> stack2)
{
    stack<int> result;
    int sum = 0;
    int carry = 0;

    while (!stack1.empty() || !stack2.empty())
    {
        // Add the top elements of the stacks with carry.
        sum = carry + (!stack1.empty() ? stack1.top() : 0) +
              (!stack2.empty() ? stack2.top() : 0);

        carry = sum / 10;

        result.push(sum % 10);

        // Pop the top elements
        if (!stack1.empty())
        {
            stack1.pop();
        }

        if (!stack2.empty())
        {
            stack2.pop();
        }
    }

    // If carry remains
    if (carry != 0)
    {
        result.push(carry);
    }

    return result;
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
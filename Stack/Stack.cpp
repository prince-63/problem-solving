#include <bits/stdc++.h>
using namespace std;
// Stack class.
class Stack
{

public:
    vector<int> arr;
    int k;

    Stack(int capacity)
    {
        k = capacity;
        arr.clear();
    }

    void push(int num)
    {
        if (arr.size() == k)
        {
            return;
        }
        arr.push_back(num);
    }

    int pop()
    {
        if (arr.empty())
        {
            return -1;
        }
        int element = arr[arr.size() - 1];
        arr.pop_back();
        return element;
    }

    int top()
    {
        if (arr.empty())
        {
            return -1;
        }
        int element = arr[arr.size() - 1];
        return element;
    }

    int isEmpty()
    {
        if (arr.empty())
        {
            return 1;
        }
        return 0;
    }

    int isFull()
    {
        if (arr.size() == k)
        {
            return 1;
        }
        return 0;
    }
};

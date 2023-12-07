#include <bits/stdc++.h>
using namespace std;

/**
 * vector
 */
void funVector()
{
    // vector<object_type> variable_name;
    vector<int> v;
    vector<int> v1;
    vector<char> v2;
    vector<string> v3;

    // assign values in vector use - push_back(value)
    v.push_back(1);
    v.push_back(2);
    v.push_back(3);

    // begin() - it is return the address of a first vector value
    auto it = v.begin();
    cout << *(it) << endl;

    // insert a value in specific position - insert(position, value)
    v.insert(it, 5);

    for (auto i : v)
    {
        cout << i << " ";
    }
    cout << endl;

    // delete or erase a value from a specific position - erase(position)
    v.erase(it);

    // excess the last address of the vector - end()
    vector<int>::iterator a = v.end();
    cout << *(a) << endl;

    // delete the last element of a vector - pop_back()
    v.pop_back();

    // excess the first element of a vector - front()
    v.front();

    // delete all element of a vector - clear()
    v.clear();

    // check vector is empty or not - empty()
    cout << v.empty() << endl;

    // size of a vector - size()
    v.size();

    // some other function
    // cbegin() – it refers to the first element of the vector.
    // cend() – it refers to the theoretical element after the last element of the vector.
    // rbegin() – it points to the last element of the vector.
    // rend() – it points to the theoretical element before the first element of the vector.
    // crbegin() – it refers to the last element of the vector.
    // crend() – it refers to the theoretical element before the first element of the vector.
    // max_size() – returns the maximum size the vector can hold.
    // capacity() – it returns the current capacity of the vector.
}

/**
 * stack
 */
void funStack()
{
    // stack<object_type> variable_name;
    stack<int> s;
    stack<string> st;

    // push() - to insert an element in the stack
    s.push(1);
    s.push(2);
    s.push(3);

    // pop() - delete the last element of the stack
    s.pop();

    // top() - it is return the top element of the stack
    cout << s.top() << endl;

    // emplace() - it is use to insert a element in a stack
    s.emplace(4);

    // size() - returns the number of element in the stack
    s.size();

    // empty() - check the stack is empty or not
    cout << s.empty() << endl;
}

/**
 * queue
 */
void funQueue()
{
    // queue<object_type> variable_name;
    queue<int> q;
    queue<string> stq;

    // push() – to insert an element in the queue.
    q.push(1);
    q.push(2);
    q.push(3);

    // pop() – deletes the first element of the queue.
    q.pop();

    // front() – return the front value of a queue
    q.front();

    // back() - return the last value of a queue
    q.back();

    // emplace() - insert a value
    q.emplace(4);

    // size() - return the number of a element in the queue
    q.size();

    // empty() - it is use to check the queue is empty or not
    cout << q.empty() << endl;
}

/**
 * Deque
 */
void funDeQue()
{
    // deque<object_type> variable_name;
    deque<int> dq;
    deque<string> strDq;

    // push_back() - insert element at end
    dq.push_back(1);
    dq.push_back(2);

    // push_front() - insert element at front
    dq.push_front(3);
    dq.push_front(4);

    // pop_back() - delete element from the last
    dq.pop_back();

    // pop_front() - delete element from the front
    dq.pop_front();

    // front() - it gives the reference to the first element
    dq.front();

    // back() - it gives the reference to the last element
    dq.back();

    // size() - it is return the number of element in a deque
    dq.size();

    // empty() - it is use to check the deque id empty or not
    cout << dq.empty() << endl;

    // other function
    // begin() – it refers to the first element of the deque.
    // end() – it refers to the theoretical element after the last element of the deque.
    // cbegin() – it refers to the first element of the deque.
    // cend() – it refers to the theoretical element after the last element of the deque
    // rbegin() – it points to the last element of the deque.
    // rend() – it points to the theoretical element before the first element of the deque.
    // emplace_front() – to insert an element at the front of the deque.
    // emplace_back() – to insert an element at the end of the deque.
    // max_size() – the maximum elements a deque can hold.
    // clear() – to delete all the elements of the deque.
    // erase() – to delete a single element or elements between a particular range.
}

/**
 * function map
 */
void funMap()
{
    // map<object_type, object_type> variable_name;
    map<int, int> mpp;
    map<char, int> chmpp;

    // insert() - this function use to insert a value in a map
    // insert(key, value)
    mpp.insert({1, 10});
    mpp.insert({2, 20});
    mpp.insert({3, 30});

    for (auto i : mpp)
    {
        cout << i.first << " -> " << i.second << endl;
    }
    cout << endl;

    // begin() - return an iterator poiter that point to the first index
    // end() - return an iterator pointer that point to the last index
    for (auto it = mpp.begin(); it != mpp.end(); it++)
    {
        cout << it->first << "->" << it->second << endl;
    }

    // clear() - delete all element of a map
    // erase() - to delete a sigle element or elements between a particular range
    // find() - find and search a value in a map
    // cbegin() – it refers to the first element of the
    // map.cend() – it refers to the theoretical element after the last element of the
    // map.rbegin() – it points to the last element of the
    // map.rend() – it points to the theoretical element before the first element of the
    // map.emplace() – to insert an element in the
    // map.max_size() – the maximum elements a map can hold.
}

int main()
{
    cout << "Hello World" << endl;
    // funVector();
    // funStack();
    // funQueue();
    // funDeQue();
    funMap();
    return 0;
}
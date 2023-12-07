#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    struct Node *next;
};
 
int main(void)
{
    struct Node *head;
    struct Node *first;
    struct Node *second;
    struct Node *third;

    first = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));

    first->data = 10;
    second->data = 20;
    third->data = 30;

    first->next = second;
    second->next = third;
    third->next = NULL;

    head = first;

    cout << "Node values : ";
    while(head != NULL) {
        cout << head->data << " ";
        head = head->next;
    } 
    cout << endl;
    
    return 0;
}
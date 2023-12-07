#include <iostream>
using namespace std;

class node {
    public : 
        int data;
        node *next;
    
    node(int data) {
        this->data = data;
        this->next = NULL;
    }
};

void createQueue(int data, node* &front, node* &rear) {
    node *newnode = new node(data);

    if(front == NULL && rear == NULL) {
        front = newnode;
        rear = newnode;
        return;
    }

    rear->next = newnode;
    rear = newnode;
}

void display(node * front, node *rear) {
    node *temp = front;

    cout << "queue is : ";
    while(temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

void del(node* &front, node* &rear) {
    node *temp = front;

    if(temp == NULL) {
        return;
    }

    if(front == rear) {
        front = NULL;
        rear = NULL;
    }

    front = front->next;
}

int main() {
    node *front = NULL;
    node *rear = NULL;

    createQueue(10, front, rear);
    createQueue(20, front, rear);
    createQueue(30, front, rear);
    createQueue(40, front, rear);
    createQueue(50, front, rear);

    display(front, rear);
    del(front, rear);
    del(front, rear);
    del(front, rear);
    display(front, rear);

    return 0;
}
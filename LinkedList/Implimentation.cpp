#include <iostream>
using namespace std;

// node class
class node {
    public : 
        int data;
        node *next;

    node(int data) {
        this->data = data;
        this->next = NULL;
    }
};

/// @brief creating a linkedlist data structure
/// @param data 
/// @param head 
void createNode(int data, node * &head) {
    node *temp = new node(data);

    temp->next = head;
    head = temp;
}

/// @brief insert a data in a begin of a linkedlist
/// @param data 
/// @param head 
void insertAtBegin(int data, node* &head) {
    node *temp = new node(data);

    temp->next = head;
    head = temp;
}

/// @brief insert a data in a end of a linkedlist
/// @param data 
/// @param head 
void insertAtend(int data, node* &head) {
    node *temp = head;
    node *newnode = new node(data);

    while(temp->next != NULL) {
        temp = temp->next;
    }

    temp->next = newnode;
}

/// @brief display the all data in a linkedlist
/// @param head 
void displayNode(node *head) {
    node *temp = head;

    cout << "Nodes -> ";
    while(temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;

}

int main() {
    node *head = NULL;

    createNode(10, head);
    insertAtBegin(12, head);
    insertAtend(13, head);
    insertAtend(14, head);
    insertAtend(15, head);

    displayNode(head);

    return 0;
}
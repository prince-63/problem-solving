/**
 * Definition of linked list
 * class Node {
 *
 * public:
 *     int data;
 *     Node* next;
 *     Node() : data(0), next(nullptr) {}
 *     Node(int x) : data(x), next(nullptr) {}
 *     Node(int x, Node* next) : data(x), next(next) {}
 * };
 */

Node *insertAtFirst(Node *list, int newValue)
{
    Node *head = new Node();
    Node *temp = new Node();

    head = list;

    temp->data = newValue;
    temp->next = head;
    head = temp;

    return head;
}
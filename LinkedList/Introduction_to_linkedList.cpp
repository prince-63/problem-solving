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

Node *constructLL(vector<int> &arr)
{
    Node *head = new Node();
    Node *tail = new Node();

    head->data = arr[0];
    tail = head;

    for (int i = 1; i < arr.size(); i++)
    {
        Node *temp = new Node();
        temp->data = arr[i];
        tail->next = temp;
        tail = temp;
    }
    return head;
}
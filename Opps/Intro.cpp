#include <bits/stdc++.h>
using namespace std;

class Student {
    public :
        string name;
        int age;
        float marks;


        void setDetails(string name, int age, float marks) {
            this->name = name;
            this->age = age;
            this->marks = marks;
        }

        void getDetails() {
            cout << "Name " << name << endl;
            cout << "Age " << age << endl;
            cout << "Marks " << marks << endl;
        }
};

int main() {
    Student first;

    // first.setDetails("Prince Kumar", 18, 100);
    // first.getDetails();

    first.name = "Prince";
    first.age = 19;
    first.marks = 100;

    cout << "Name " << first.name << endl;

    return 0;
}
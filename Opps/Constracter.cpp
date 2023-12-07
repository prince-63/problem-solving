#include <bits/stdc++.h>
using namespace std;

class Student {
    public :
        string name;
        int age;
        float marks;

        // default constructer
        Student() {
            this->name = "Prince";
            this->age = 19;
            this->marks = 100;
        }

        // parametrige  constructer
        Student(string name, int age, float marks) {
            this->name = name;
            this->age = age;
            this->marks = marks;
        }

        // set methods
        void setDetails(string name, int age, float marks) {
            this->name = name;
            this->age = age;
            this->marks = marks;
        }

        // get method
        void getDetails() {
            cout << "Name " << name << endl;
            cout << "Age " << age << endl;
            cout << "Marks " << marks << endl;
        }
};

int main() {
    // Student first;

    Student first("Prince", 18, 100);
    first.getDetails();

    return 0;
}
// Encapsulatation most of the time use for security purpose
#include <bits/stdc++.h>
using namespace std;

class Student {
    private :
        string name;

    public :

        void setName(string  name) {
            this->name = name;
        }

        string getName() {
            return this->name;
        }
};

int main() {
    
    Student first;

    first.setName("Prince Kumar");
    cout << "Name is : " << first.getName() << endl;
    return 0;
}
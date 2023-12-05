#include <iostream>
#include <string>

using namespace std;

class Persona {
public:
    string nombre;
    int edad;

    // Constructor
    Persona(const string& nombre, int edad)
        : nombre(nombre), edad(edad) {}

    // Member function
    void correr() {
        cout << nombre << " Esta corriendo" << endl;
    }
};

int main() {
    // Example usage
    Persona per("Kevin", 18);
    per.correr();

    return 0;
}

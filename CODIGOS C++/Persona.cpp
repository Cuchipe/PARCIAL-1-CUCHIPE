#include <iostream>
#include <string>
using namespace std;

class Persona {
public:
    string nombre;
    int edad;

  
    Persona(const string& nombre, int edad)
        : nombre(nombre), edad(edad) {}

   
    void correr() {
        cout << nombre << " Empezo a correr" << endl;
    }
};

int main() {
    // Example usage
    Persona per("Kevin", 18);
    per.correr();

    return 0;
}

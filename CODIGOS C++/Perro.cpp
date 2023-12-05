#include <iostream>
#include <string>

using namespace std;

class Perro {
public:
    string nombre;
    int edad;
    string raza;


    Perro(const string& nombre, int edad, const string& raza)
        : nombre(nombre), edad(edad), raza(raza) {}

   
    void comer() {
        cout << nombre << " Empezo a comer" << endl;
    }

    void ladrar() {
        cout << nombre << " Empezo a ladrar" << endl;
    }

    void jugar() {
        cout << nombre << " Empezo a jugar" << endl;
    }
};

int main() {
    // Example usage
    Perro perro1("Dino", 18, "Budgol");
    perro1.comer();
    perro1.ladrar();
    perro1.jugar();

    return 0;
}

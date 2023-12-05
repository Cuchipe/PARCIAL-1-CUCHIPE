#include <iostream>
#include <string>

using namespace std;

class Gato {
public:
    string nombre;
    int edad;
    string raza;

    // Constructor
    Gato(string nombre, int edad, string raza) {
        this->nombre = nombre;
        this->edad = edad;
        this->raza = raza;
    }

    // Member functions
    void maullar() {
        cout << this->nombre << " Empezo a maullar" << endl;
    }

    void saltar() {
        cout << this->nombre << " Empezo a saltar" << endl;
    }

    void correr() {
        cout << this->nombre << " Empezo a correr" << endl;
    }
};

class Perro {
public:
    string nombre;
    int edad;
    string raza;

    // Constructor
    Perro(string nombre, int edad, string raza) {
        this->nombre = nombre;
        this->edad = edad;
        this->raza = raza;
    }

    // Member functions
    void comer() {
        cout << this->nombre << " Esta comiendo" << endl;
    }

    void ladrar() {
        cout << this->nombre << " Esta ladrando" << endl;
    }

    void jugar() {
        cout << this->nombre << " Esta jugando" << endl;
    }
};

int main() {
    // Example usage
    Gato gato1("Perla", 18, "Budgol");
    gato1.maullar();
    gato1.saltar();
    gato1.correr();

    Perro perro1("Dino", 18, "Budgol");
    perro1.comer();
    perro1.ladrar();
    perro1.jugar();

    return 0;
}

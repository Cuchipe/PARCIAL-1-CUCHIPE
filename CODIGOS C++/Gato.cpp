#include <iostream>
#include <string>

using namespace std;

class Gato {
public:
    std::string nombre;
    int edad;
    std::string raza;

    // Constructor
    Gato(string nombre, int edad, string raza) {
        this->nombre = nombre;
        this->edad = edad;
        this->raza = raza;
    }

    
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

int main() {
    // Example usage
    Gato miGato("Michi", 3, "Siames");
    miGato.maullar();
    miGato.saltar();
    miGato.correr();

    return 0;
}

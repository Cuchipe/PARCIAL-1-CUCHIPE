#include <iostream>
#include <string>

using namespace std;

class Vehiculo {
public:
    string modelo;
    int anio;

    // Constructor
    Vehiculo(const string& modelo, int anio)
        : modelo(modelo), anio(anio) {}

    // Member function
    void correr(int velocidad) {
        cout << modelo << " del anio " << anio << " esta corriendo a " << velocidad << " km/h" << endl;
    }
};

int main() {
    // Example usage
    Vehiculo moto("AVEO", 2013);
    moto.correr(30);

    return 0;
}

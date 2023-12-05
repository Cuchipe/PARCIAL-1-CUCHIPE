#include <iostream>
#include <string>
using namespace std;

class Vehiculo {
public:
    string modelo;
    int ano;

   
    Vehiculo(const string& modelo, int ano)
        : modelo(modelo), ano(ano) {}

    
    void correr(int velocidad) {
        if (velocidad > 50) {
            cout << modelo << " " << ano << " multado" << endl;
        } else {
            cout << modelo << " " << ano << " no multado" << endl;
        }
    }
};

int main() {
    // Example usage
    Vehiculo vehiculo("AVEO", 2013);
    vehiculo.correr(30);

    return 0;
}

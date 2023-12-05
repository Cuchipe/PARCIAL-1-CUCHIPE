#include <iostream>
#include <limits>
using namespace std;

int obtenerNumero(const string& mensaje) {
    int numero = 0;
    bool entradaValida = false;

    while (!entradaValida) {
        cout << mensaje;
        if (cin >> numero) {
            entradaValida = true;
        } else {
            cout << "Error: Ingrese un número válido." << endl;
            cin.clear();
            cin.ignore(std::numeric_limits<streamsize>::max(), '\n');
        }
    }

    return numero;
}

int obtenerOpcion() {
    int opcion = 0;
    bool entradaValida = false;

    while (!entradaValida) {
        cout << "Escoja la operación a realizar:" << endl;
        cout << "1 ---> Suma" << endl;
        cout << "2 ---> Resta" << endl;
        cout << "3 ---> Multiplicación" << endl;
        cout << "4 ---> División" << endl;

        if (cin >> opcion) {
            if (opcion >= 1 && opcion <= 4) {
                entradaValida = true;
            } else {
                cout << "Opción inválida. Por favor, seleccione una operación válida (1-4)." << endl;
            }
        } else {
            cout << "Error: Ingrese un número válido para la operación." << endl;
            cin.clear();
            cin.ignore(numeric_limits<std::streamsize>::max(), '\n');
        }
    }

    return opcion;
}

int sumar(int a, int b) {
    return a + b;
}

int restar(int a, int b) {
    return a - b;
}

int multiplicar(int a, int b) {
    return a * b;
}

int dividir(int a, int b) {
    if (b != 0) {
        return a / b;
    } else {
        cout << "Error: No se puede dividir por cero." << endl;
        return 0;
    }
}

int main() {
    cout << "    CALCULEITOR.COM" << endl;
    cout << "   ---BIENVENIDO---" << endl;
    cout << "--------------------------" << endl;

    int num1 = obtenerNumero("Dijite el primer valor: ");
    int num2 = obtenerNumero("Dijite el segundo valor: ");

    cout << "--------------------------" << endl;

    int opcion = obtenerOpcion();

    switch (opcion) {
        case 1:
            cout << "El resultado de la operación es: " << sumar(num1, num2) << endl;
            break;
        case 2:
            cout << "El resultado de la operación es: " << restar(num1, num2) << endl;
            break;
        case 3:
            cout << "El resultado de la operación es: " << multiplicar(num1, num2) << endl;
            break;
        case 4:
            cout << "El resultado de la operación es: " << dividir(num1, num2) << endl;
            break;
        default:
            cout << " --Operación aprobada--" << endl;
    }

     cout << "----------------------" << endl;
    cout << "     --Thank you --" << endl;

    return 0;
}

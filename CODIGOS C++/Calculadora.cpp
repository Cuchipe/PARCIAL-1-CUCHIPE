#include <iostream>

using namespace std;

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
    int resultado = 0;

    cout << "    CALCULEITOR.COM" << endl;
    cout << "   ---BIENVENIDO---" << endl;
    cout << "--------------------------" << endl;

    cout << "Dijite el primer valor: ";
    int num1;
    cin >> num1;

    cout << "Dijite el segundo valor: ";
    int num2;
    cin >> num2;
    cout << "--------------------------" << endl;

    cout << "Escoja la operacion a realizar:" << endl;
    cout << "1 ---> Suma" << endl;
    cout << "2 ---> Resta" << endl;
    cout << "3 ---> Multiplicación" << endl;
    cout << "4 ---> División" << endl;
    int opcion;
    cin >> opcion;

    switch (opcion) {
        case 1:
            resultado = sumar(num1, num2);
            break;
        case 2:
            resultado = restar(num1, num2);
            break;
        case 3:
            resultado = multiplicar(num1, num2);
            break;
        case 4:
            resultado = dividir(num1, num2);
            break;
        default:
            cout << " --Operacion aprobada--" << endl;
    }

    cout << "----------------------" << endl;
    cout << "El resultado de la operacion es: " << resultado << endl;
    cout << "     --Thank you --" << endl;

    return 0;
}

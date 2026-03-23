
void main() {
    //Entradas

    IO.print("Digite o valor do raio: ");
    float r = Float.parseFloat(IO.readln());
    IO.print("Digite o valor da altura: ");
    float h = Float.parseFloat(IO.readln());

    double p = Math.pow(r, 2);
    double v = (3.14 * p)* h;


    //Saída(s)

    IO.println("o volume da lata é  = " + v);
}
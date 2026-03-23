import static java.lang.IO.readln;

void main() {
    IO.print("Digite o valor da compra: ");

    float compra = Float.parseFloat(readln());

    IO.print("Você é cliente premium? Sim/Não: ");
    String premium = readln();

    if (compra>=150 && !premium.equals("Não")) {
        IO.print("VOCÊ TEM DIREITO A FRETE GRÁTIS! ");

    }else{
        double frete = compra / 0.5;
        IO.println("Desculpe, terá que pagar " + frete + " De frete!");

    }

}
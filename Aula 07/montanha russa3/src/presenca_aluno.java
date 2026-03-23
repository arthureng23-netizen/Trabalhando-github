import static java.lang.IO.print;
void main() {
    print("Digite a primeira nota: ");
    float p1 = FloatparseFloat(readln());

    print("Digite a segunda nota: ");
    float p2 = FloatparseFloat(readln());

    print("Digite a terceira nota: ");
    float p3 = FloatparseFloat(readln());

    print("Digite a quarta nota: ");
    float p4 = FloatparseFloat(readln());

    float mf = (p1 + p2 + p3 + p4) / 4;

    print("Digite a porcentagem de sua presença anual: ");
    int presença = Integer.parseInt(IO.readln());


    if (mf <= 7 && presença = < 75){
        print("Você esta reprovado! ");

    else if (mf < 7 && presença < 75) {
        print("VocÊ esta reprovado");
    }
    else {
        print("Você está de recuperação: ");
}
}
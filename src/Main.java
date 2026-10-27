//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Enrutador router = new Enrutador("Router01", "192.168.1.1", true);

    router.mostrarEstado();

    System.out.println("\nProbando direcciones IP:");

    router.setDireccionIP("192.168.0.10");
    router.setDireccionIP("256.168.1.1");
    router.setDireccionIP("192.168.1");
    router.setDireccionIP("10.0.0.1");

    System.out.println("\nEstado final:");
    router.mostrarEstado();
}

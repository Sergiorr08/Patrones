public class gato extends felina {
    private void tomar_leche(){
        System.out.println("Tome leche");
    }
    @Override
    public void hacer_sonido(){
        System.out.println("Miau");
        tomar_leche();
    }

}


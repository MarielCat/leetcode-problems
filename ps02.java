//Given an integer x, return true if x is a palindrome, and false otherwise.
class ps02 {
    public boolean isPalindrome(int x) {
        //Verificamos que no sea negativo, los negativos no son palindromos.
        if (x < 0) {
            return false; // Los números negativos no son palíndromos.
        }
        //Convetimos a String
        String newString = Integer.toString(x);
        //Variable que alberga la longitud del String
        int n = newString.length();

        /*Ciclo for donde:
        *Primero recorre la cadena hasta la mitad*/
        for (int i = 0; i < n / 2; i++) {
            //Accedemos a la otra mitad de la cadena y comparamos con la otra mitad.
            if (newString.charAt(i) != newString.charAt(n - 1- i)) {
                return false;
            }
        }

        return true;
    }
}

public class ps11 {
        public int lengthOfLastWord(String s) {
            s = s.trim();
            int longitud = 0;
            
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != ' ') {
                    longitud++; // Incrementamos la longitud de la palabra actual.
                } else {
                    break; // Si encontramos un espacio en blanco, terminamos el bucle.
                }
            }
            
            return longitud;
        }
    }
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.mor.chinelo.tip2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author PCio
 */
public class ChangeRareCharacters {

    public static void main(String[] args) throws Exception {
        ChangeRareCharacters m = new ChangeRareCharacters();
        ArrayList<String> wordsToChange = new ArrayList<>();
        wordsToChange.add("geometría");
        wordsToChange.add("Nápoles");
        wordsToChange.add("cerámica");
        wordsToChange.add("ejército");
        wordsToChange.add("fatídico");
        wordsToChange.add("Cancún");
        wordsToChange.add("hígado");

        for (String string : wordsToChange) {
            string = m.cambiarCaracteresRarosToNormales(string);
            System.out.println(string);
        }
    }

    /**
     * Remove characters from words.
     *
     * @param wordRare Word with rare characters
     * @return Word with remove characters
     * @throws Exception
     */
    private String cambiarCaracteresRarosToNormales(String wordRare) throws Exception {
        if (wordRare == null) {
            throw new Exception("La cadena a modificar no puede ser null");
        }
        if (wordRare.isEmpty()) {
            throw new Exception("La cadena a modificar no puede ser null");
        }
        HashMap<String, String> mapCharactersRemove = new HashMap<String, String>();
        mapCharactersRemove.put("à", "a");
        mapCharactersRemove.put("á", "a");
        mapCharactersRemove.put("â", "a");
        mapCharactersRemove.put("ã", "a");
        mapCharactersRemove.put("ä", "a");
        mapCharactersRemove.put("å", "a");
        mapCharactersRemove.put("å", "a");
        mapCharactersRemove.put("Á", "A");
        mapCharactersRemove.put("Ã", "A");
        mapCharactersRemove.put("Ä", "A");
        mapCharactersRemove.put("Å", "A");
        mapCharactersRemove.put("è", "e");
        mapCharactersRemove.put("é", "e");
        mapCharactersRemove.put("é", "e");
        mapCharactersRemove.put("ê", "e");
        mapCharactersRemove.put("ë", "e");
        mapCharactersRemove.put("ì", "i");
        mapCharactersRemove.put("í", "i");
        mapCharactersRemove.put("ï", "i");
        mapCharactersRemove.put("ì", "i");
        mapCharactersRemove.put("Ì", "I");
        mapCharactersRemove.put("Í", "I");
        mapCharactersRemove.put("Î", "I");
        mapCharactersRemove.put("Ï", "I");
        mapCharactersRemove.put("Ì", "I");
        mapCharactersRemove.put("ó", "o");
        mapCharactersRemove.put("ô", "o");
        mapCharactersRemove.put("õ", "o");
        mapCharactersRemove.put("ö", "o");
        mapCharactersRemove.put("Ò", "O");
        mapCharactersRemove.put("Ó", "O");
        mapCharactersRemove.put("Ô", "O");
        mapCharactersRemove.put("Õ", "O");
        mapCharactersRemove.put("Ö", "O");
        mapCharactersRemove.put("ù", "u");
        mapCharactersRemove.put("ú", "u");
        mapCharactersRemove.put("û", "u");
        mapCharactersRemove.put("ü", "u");
        mapCharactersRemove.put("Ü", "U");
        mapCharactersRemove.put("Û", "U");
        mapCharactersRemove.put("Ú", "U");
        mapCharactersRemove.put("Ù", "U");

        for (int i = 0; i < wordRare.length(); i++) {
            char viejaLetra = wordRare.charAt(i);
            String nuevaLetra = mapCharactersRemove.get(String.valueOf(wordRare.charAt(i)));
            if (nuevaLetra != null) {
                wordRare = wordRare.replace(viejaLetra, nuevaLetra.charAt(0));
            }
        }
        return wordRare;
    }

}

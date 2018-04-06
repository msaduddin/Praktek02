/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author Smekma
 */
public class KulkasAksi {
    public static void main(String[] args) {
        Kulkas Udin = new Kulkas();
        
        Udin.Warna="Biru";
        Udin.Merk="LG";
        Udin.Kapasitas="136";
        Udin.Style="2 Pintu";
        Udin.Ukuran="Besar";
        
        Udin.cetakInfo();
    }
}

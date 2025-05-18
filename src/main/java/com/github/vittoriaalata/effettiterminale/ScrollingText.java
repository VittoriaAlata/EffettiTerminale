package com.github.vittoriaalata.effettiterminale;

import static com.github.vittoriaalata.effettiterminale.Animazioni.*;

public class ScrollingText {
    private static void ReAnimazione(int LunghezzaCarattereAnimato, String Animazione, int MillisAnimDelay, int Ripetizioni) throws InterruptedException {
        for (int i = 0; i < Ripetizioni; i++) {
                AnimazioneCaricamento(LunghezzaCarattereAnimato, Animazione, MillisAnimDelay);
        }
    }

    public static void AnimazioneCaricamento(int LunghezzaCarattereAnimato, String Animazione, int MillisAnimDelay) throws InterruptedException {
        while (Animazione.length() > 0) {
            System.out.print("\r" + Animazione.substring(0, LunghezzaCarattereAnimato));
            Animazione = Animazione.substring(LunghezzaCarattereAnimato);
            Thread.sleep(MillisAnimDelay);
        }
    }
}

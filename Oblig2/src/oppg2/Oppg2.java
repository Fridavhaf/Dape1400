package oppg2;

import javax.swing.*;


class Tallspill {
    public int nyttTall() {
        return (int) (Math.random() * 201);
    }

    public void visMelding(String melding) {
        JOptionPane.showMessageDialog(null, melding);
    }

    private void forLite(int tall) {
        visMelding(tall + " er for lavt, vennligst prøv igjen.");

    }

    private void forStort(int tall) {
        visMelding(tall + " er for høyt, vennligst prøv igjen.");
    }

    public void avsluttRunde(int antall, int tall) {
        visMelding(tall + " er riktig!\nDu gjettet riktig på " + antall + " forsøk!");
    }

    public void kjørSpill() {
        int generertTall = nyttTall();
        int antall = 0;

        while (true) {
            String innTall = JOptionPane.showInputDialog("Jeg tenker på et tall mellom 0 og 200.\nGjett hvilket!");
            int tall;
            try {
                tall = Integer.parseInt(innTall);
                antall++;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Dette er ikke et tall mellom 0 og 200." +
                        "\nTall er satt til 0.");
                tall = 0;
            }

            if (tall > generertTall) {
                forStort(tall);
            } else if (tall < generertTall) {
                forLite(tall);
            } else {
                avsluttRunde(antall, tall);
                break;
            }
        }
    }
}

public class Oppg2 {
    public static void main(String[] args) {
        Tallspill spill1 = new Tallspill();

        while (true) {
            spill1.kjørSpill();
            int svar = JOptionPane.showConfirmDialog(null, "Vil du spille igjen?", "Spill igjen", JOptionPane.YES_NO_OPTION);

            if (svar != JOptionPane.YES_OPTION) {
                break; // Exit the game loop if the user doesn't want to play again
            }
        }
    }
}
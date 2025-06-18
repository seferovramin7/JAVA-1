import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The secret word (students can change this later)
        String secretWord = "JAVA";
        String guessedWord = "____"; // What player sees
        int wrongGuesses = 0;
        int maxWrongGuesses = 6;
        String guessedLetters = "";

        // Welcome screen
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║          🎮 HANGMAN GAME 🎮            ║");
        System.out.println("║        Can you save the stick man?     ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();

        // Game loop
        while (true) {
            // Show current hangman state
            drawHangman(wrongGuesses);

            // Show game status
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║               GAME STATUS              ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║  Word: " + addSpaces(guessedWord) + "                    ║");
            System.out.println("║  Wrong guesses: " + wrongGuesses + "/" + maxWrongGuesses + "              ║");
            System.out.println("║  Letters tried: " + guessedLetters + "                 ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println();

            // Get player's guess
            System.out.print("🤔 Guess a letter: ");
            String input = scanner.nextLine().toUpperCase();

            if (input.length() != 1) {
                System.out.println("❌ Please enter only one letter!");
                continue;
            }

            char guess = input.charAt(0);

            // Check if already guessed
            if (guessedLetters.contains(String.valueOf(guess))) {
                System.out.println("🔄 You already tried that letter!");
                continue;
            }

            // Add to guessed letters
            guessedLetters += guess + " ";

            // Check if guess is in the word
            boolean isCorrectGuess = false;
            String newGuessedWord = "";

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    newGuessedWord += guess;
                    isCorrectGuess = true;
                } else {
                    newGuessedWord += guessedWord.charAt(i);
                }
            }

            guessedWord = newGuessedWord;

            // TASK 1: Students need to fix this condition!
            // TODO: Check if the guess was WRONG (not correct)
            // if (isCorrectGuess ??? false) {
            if (true) { // This will always run - students need to fix!
                wrongGuesses++;
                System.out.println("❌ Wrong! The letter '" + guess + "' is not in the word.");
            } else {
                System.out.println("✅ Great! The letter '" + guess + "' is in the word!");
            }

            // TASK 2: Students need to fix this condition!
            // TODO: Check if player WON (guessed the complete word)
            // if (guessedWord ??? secretWord) {
            if (false) { // This will never run - students need to fix!
                drawHangman(wrongGuesses);
                System.out.println("🎉════════════════════════════════════════🎉");
                System.out.println("║          🏆 CONGRATULATIONS! 🏆          ║");
                System.out.println("║        You saved the stick man!         ║");
                System.out.println("║         The word was: " + secretWord + "             ║");
                System.out.println("🎉════════════════════════════════════════🎉");
                break;
            }

            // TASK 3: Students need to fix this condition!
            // TODO: Check if player LOST (too many wrong guesses)
            // if (wrongGuesses ??? maxWrongGuesses) {
            if (false) { // This will never run - students need to fix!
                drawHangman(wrongGuesses);
                System.out.println("💀════════════════════════════════════════💀");
                System.out.println("║            😵 GAME OVER! 😵              ║");
                System.out.println("║        The stick man is gone...         ║");
                System.out.println("║         The word was: " + secretWord + "             ║");
                System.out.println("💀════════════════════════════════════════💀");
                break;
            }

            System.out.println("\n" + "=".repeat(50) + "\n");
        }

        scanner.close();
    }

    // Method to draw the hangman based on wrong guesses
    public static void drawHangman(int wrongGuesses) {
        System.out.println("    ╔═══════════════╗");
        System.out.println("    ║    HANGMAN    ║");
        System.out.println("    ╚═══════════════╝");
        System.out.println("         ┌─────┐");
        System.out.println("         │     │");

        if (wrongGuesses >= 1) {
            System.out.println("         │     😵");  // Head
        } else {
            System.out.println("         │      ");
        }

        if (wrongGuesses >= 4) {
            System.out.println("         │    \\│/");  // Both arms
        } else if (wrongGuesses >= 3) {
            System.out.println("         │     │/");  // Right arm
        } else if (wrongGuesses >= 2) {
            System.out.println("         │     │ ");  // Body
        } else {
            System.out.println("         │      ");
        }

        if (wrongGuesses >= 6) {
            System.out.println("         │    / \\");  // Both legs
        } else if (wrongGuesses >= 5) {
            System.out.println("         │    / ");   // Left leg
        } else {
            System.out.println("         │      ");
        }

        System.out.println("         │");
        System.out.println("    ═════════════");
        System.out.println();
    }

    // Helper method to add spaces between letters
    public static String addSpaces(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i);
            if (i < word.length() - 1) {
                result += " ";
            }
        }
        return result;
    }
} 
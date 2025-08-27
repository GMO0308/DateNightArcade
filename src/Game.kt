// Activity 3: Game.kt
// Class to represent an arcade game
import kotlin.random.Random

class Game(private val cost: Int) {

    // Play the game using a card
    fun play(card: Card) {
        if (card.creditBalance >= cost) {
            card.creditBalance -= cost
            val ticketsWon = Random.nextInt(0, 10) // Random tickets won
            card.ticketBalance += ticketsWon
            println("Card #${card.id} won $ticketsWon tickets!")
            card.displayBalances()
        } else {
            println("Insufficient credits to play this game.")
        }
    }
}

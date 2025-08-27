// Activity 3: Card.kt
// Class to represent a game card with credit and ticket balances
class Card(val id: Int) {
    var creditBalance: Int = 0
    var ticketBalance: Int = 0

    // Display the card's current balances
    fun displayBalances() {
        println("Card #$id - Credits: $creditBalance, Tickets: $ticketBalance")
    }
}

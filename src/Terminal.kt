// Activity 3: Terminal.kt
// Class to represent an arcade terminal
class Terminal {
    // List of available prizes
    private val prizes = listOf(
        PrizeCategory("Candy", 10, 5),
        PrizeCategory("Hat", 20, 3),
        PrizeCategory("Glasses", 30, 2)
    )

    // Add credits to a card based on money inserted
    fun addCredits(card: Card, money: Int) {
        card.creditBalance += money * 2 // $1 = 2 credits
        card.displayBalances()
    }

    // Transfer all credits from one card to another
    fun transferCredits(from: Card, to: Card) {
        to.creditBalance += from.creditBalance
        from.creditBalance = 0
        from.displayBalances()
        to.displayBalances()
    }

    // Transfer all tickets from one card to another
    fun transferTickets(from: Card, to: Card) {
        to.ticketBalance += from.ticketBalance
        from.ticketBalance = 0
        from.displayBalances()
        to.displayBalances()
    }

    // Request a prize using a card
    fun requestPrize(prizeName: String, card: Card) {
        val prize = prizes.find { it.name == prizeName }
        if (prize != null && card.ticketBalance >= prize.ticketsRequired && prize.stock > 0) {
            card.ticketBalance -= prize.ticketsRequired
            prize.stock--
            println("Prize ${prize.name} awarded! Remaining stock: ${prize.stock}")
            card.displayBalances()
        } else {
            println("Prize cannot be awarded. Either insufficient tickets or out of stock.")
        }
    }
}

int index = 0;
for (int suit = 0; suit &lt;= 3; suit++) {
    for (int rank = 1; rank &lt;= 13; rank++) {
        cards[index] = new Card(rank, suit);
        index++;
    }
}
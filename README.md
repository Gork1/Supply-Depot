17/01/2016 13h18
Supply Depot 0.1

To do :

1) Create DB or 2 Tables.
   - One that stores each and every input/output in the depot.
     - ItemCode: Item Code
     - Date: Date of input/output
     - ItemChange: Amount in/out
     - StockAddress: Stock Address of input/output
     - ChangeOrigin: Origin of input/output(ie Lunar Rover)
   - One that sores Stock addresses and their content(unlimited
   addresses and content in each address for now, might change in the
   future if we have physical limits to the depot), empty addresses are
   allowed.
     - StockAddress: Integers from 1 to infinity
     - ItemCode
     - ItemAmount: Total Amount in this address

2) Setup interaction between external input/output and DB/Tables.

3) Setup log with, in order:
   - -Date-: -Absolute value of ItemChange- -ItemName- [-ItemCode-] were
   added to/taken from Compartment -StockAddress- by -ChangeOrigin- for
   a new total of -ItemAmount- -ItemName- [-ItemCode-].

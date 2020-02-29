# Assignment3
JUnit assignment using a user made trigonometry library as a base for testing

The main part of the trig library is the sin/cos functions. The idea behind them is to simplify the Taylor series terms by
relating each term to the term previous to it. This removes the need for a true factorial calculation and allows for larger
inputs. The only other strange piece of code is the fact that tan will return 999999999 in the case of what would be an 
undefined result.

For testing a relatively generous delta was given since we are comparing two floating point numbers but this number could
honestly probably be lowered a lot.

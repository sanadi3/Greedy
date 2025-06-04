# Greedy
Greedy algorithm to determine the optimal sequence of homework to be solved, considering their specific weight. In this scenario, each assignment requires one hour to be solved.

The algorithm makes its greedy choice by selecting the homework with the first earliest deadline, moving on to the next consecutively. If two homeworks have the same deadline, a comparator class is used to select the one with the highest weight instead.

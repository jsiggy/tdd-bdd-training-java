Feature: ATM Withdrawal

  Rule: Customer can withdraw funds
    Scenario: Sufficient funds
      Given Joe has $350 in his checking account
      When he requests $200
      Then he receives $200
      And his new bank balance is $150

    Scenario: Insufficient funds
      Given Joe has $185 in his checking account
      When he requests $200
      Then he receives $0
      And his new bank balance is $185


  Rule: ATM withdrawals limited to $300 per day

    Scenario: can withdraw up to the max
      Given Joe has $310 in his checking account
      And he has not withdrawn any money from the ATM today
      When he requests $300
      Then he receives $300
      And his new bank balance is $10

    Scenario: cannot withdraw more than maximum
      Given Joe has $500 in his checking account
      And he has not withdrawn any money from the ATM today
      When he requests $320
      Then he receives $0
      And his new bank balance is $500

    Scenario: can withdraw up to the max in multiple transactions in one day
      Given Joe has $650 in his checking account
      And he withdraws $200
      When he requests $100
      Then he receives $100
      And his new bank balance is $350

    Scenario: cannot withdraw more than max in multiple transactions in one day

    Scenario: can withdraw more than the max in multiple transactions across multiple days

package leopard.squad.training

import spock.lang.Specification

class BinaryCupsTest extends Specification {

    def 'when_requesting_1_litre_cost_is_(1)'(){ // partially fill the small cup

        given:
          def binaryCups = new BinaryCups()
          def litres = 1
          def cupSize = 'small'
          def cost = 1
          def cup = new Cup(cupSize, litres, cost)

        when:
          def dispensedCup = binaryCups.dispense(litres)

        then:
          dispensedCup[0].getCupSize() == cupSize
          dispensedCup[0].getFillLevelInLitres() == litres
          dispensedCup[0].getCost() == cost
    }

    def 'when_requesting_2_litre_cost_is_(1)'(){ // fill the small cup to top

        given:
          def binaryCups = new BinaryCups()
          def litres = 2
          def cupSize = 'small'
          def cost = 1
          def cup = new Cup(cupSize, litres, cost)

        when:
          def dispensedCup = binaryCups.dispense(litres)

        then:
          dispensedCup[0].getCupSize() == cupSize
          dispensedCup[0].getFillLevelInLitres() == litres
          dispensedCup[0].getCost() == cost
    }

    def 'when_requesting_3_litres_cost_is(2)'(){ // fill the medium cup to top

        given:
          def binaryCups = new BinaryCups()
          def litres = 3
          def cupSize = 'medium'
          def cost = 2
          def cup = new Cup(cupSize, litres, cost)

        when:
          def dispensedCup = binaryCups.dispense(litres)

        then:
          dispensedCup[0].getCupSize() == cupSize
          dispensedCup[0].getFillLevelInLitres() == litres
          dispensedCup[0].getCost() == cost

    }

    def 'when_requesting_4_litres_cost_is(3)'(){ // partially fill small + medium cups

        given:
          def binaryCups = new BinaryCups()
          def litresForCup1 = 2
          def litresForCup2 = 2
          def smallCup = 'small'
          def mediumCup = 'medium'
          def costForCup1 = 1
          def costForCup2 = 2
          def cup1 = new Cup(smallCup, litresForCup1, costForCup1)
          def cup2 = new Cup(mediumCup, litresForCup2, costForCup2)
          def expectedTotalCost = 3
          def requestedLitres = 4

        when:
          def dispensedCup = binaryCups.dispense(requestedLitres)

        then:
          dispensedCup[0].getCupSize() == smallCup
          dispensedCup[0].getFillLevelInLitres() == litresForCup1
          dispensedCup[0].getCost() == costForCup1
          dispensedCup[1].getCupSize() == mediumCup
          dispensedCup[1].getFillLevelInLitres() == litresForCup2
          dispensedCup[1].getCost() == costForCup2
          dispensedCup[0].getCost() + dispensedCup[1].getCost() == expectedTotalCost
    }
}

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

    def 'when_requesting_5_litres_cost_is(3)'(){

        given:
        def binaryCups = new BinaryCups()
        def litresForCup1 = 2
        def litresForCup2 = 3
        def smallCup = 'small'
        def mediumCup = 'medium'
        def costForCup1 = 1
        def costForCup2 = 2
        def cup1 = new Cup(smallCup, litresForCup1, costForCup1)
        def cup2 = new Cup(mediumCup, litresForCup2, costForCup2)
        def expectedTotalCost = 3
        def requestedLitres = 5

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

    def 'when_requesting_6_litres_cost_is(5)'(){

        given:
        def binaryCups = new BinaryCups()
        def litresForCup1 = 2
        def litresForCup2 = 4
        def smallCup = 'small'
        def largeCup = 'large'
        def costForCup1 = 1
        def costForCup2 = 4
        def cup1 = new Cup(smallCup, litresForCup1, costForCup1)
        def cup2 = new Cup(largeCup, litresForCup2, costForCup2)
        def expectedTotalCost = 5
        def requestedLitres = 6

        when:
        def dispensedCup = binaryCups.dispense(requestedLitres)

        then:
        dispensedCup[0].getCupSize() == smallCup
        dispensedCup[0].getFillLevelInLitres() == litresForCup1
        dispensedCup[0].getCost() == costForCup1
        dispensedCup[1].getCupSize() == largeCup
        dispensedCup[1].getFillLevelInLitres() == litresForCup2
        dispensedCup[1].getCost() == costForCup2
        dispensedCup[0].getCost() + dispensedCup[1].getCost() == expectedTotalCost
    }

    def 'when_requesting_7_litres_cost_is(6)'(){

        given:
        def binaryCups = new BinaryCups()
        def litresForCup1 = 3
        def litresForCup2 = 4
        def mediumCup = 'medium'
        def largeCup = 'large'
        def costForCup1 = 2
        def costForCup2 = 4
        def cup1 = new Cup(mediumCup, litresForCup1, costForCup1)
        def cup2 = new Cup(largeCup, litresForCup2, costForCup2)
        def expectedTotalCost = 6
        def requestedLitres = 7

        when:
        def dispensedCup = binaryCups.dispense(requestedLitres)

        then:
        dispensedCup[0].getCupSize() == mediumCup
        dispensedCup[0].getFillLevelInLitres() == litresForCup1
        dispensedCup[0].getCost() == costForCup1
        dispensedCup[1].getCupSize() == largeCup
        dispensedCup[1].getFillLevelInLitres() == litresForCup2
        dispensedCup[1].getCost() == costForCup2
        dispensedCup[0].getCost() + dispensedCup[1].getCost() == expectedTotalCost
    }

    def 'when_requesting_8_litres_cost_is(7)'(){

        given:
        def binaryCups = new BinaryCups()
        def litresForCup1 = 2
        def litresForCup2 = 3
        def litresForCup3 = 3
        def smallCup = 'small'
        def mediumCup = 'medium'
        def largeCup = 'large'
        def costForCup1 = 1
        def costForCup2 = 2
        def costForCup3 = 4
        def cup1 = new Cup(smallCup, litresForCup1, costForCup1)
        def cup2 = new Cup(mediumCup, litresForCup1, costForCup1)
        def cup3 = new Cup(largeCup, litresForCup2, costForCup2)
        def expectedTotalCost = 7
        def requestedLitres = 8

        when:
        def dispensedCup = binaryCups.dispense(requestedLitres)

        then:
        dispensedCup[0].getCupSize() == smallCup
        dispensedCup[0].getFillLevelInLitres() == litresForCup1
        dispensedCup[0].getCost() == costForCup1
        dispensedCup[1].getCupSize() == mediumCup
        dispensedCup[1].getFillLevelInLitres() == litresForCup2
        dispensedCup[1].getCost() == costForCup2
        dispensedCup[2].getCupSize() == largeCup
        dispensedCup[2].getFillLevelInLitres() == litresForCup3
        dispensedCup[2].getCost() == costForCup3
        dispensedCup[0].getCost() + dispensedCup[1].getCost() + dispensedCup[2].getCost() == expectedTotalCost

    }

    def 'when_requesting_9_litres_cost_is(7)'(){

        given:
        def binaryCups = new BinaryCups()
        def litresForCup1 = 2
        def litresForCup2 = 3
        def litresForCup3 = 4
        def smallCup = 'small'
        def mediumCup = 'medium'
        def largeCup = 'large'
        def costForCup1 = 1
        def costForCup2 = 2
        def costForCup3 = 4
        def cup1 = new Cup(smallCup, litresForCup1, costForCup1)
        def cup2 = new Cup(mediumCup, litresForCup1, costForCup1)
        def cup3 = new Cup(largeCup, litresForCup2, costForCup2)
        def expectedTotalCost = 7
        def requestedLitres = 9

        when:
        def dispensedCup = binaryCups.dispense(requestedLitres)

        then:
        dispensedCup[0].getCupSize() == smallCup
        dispensedCup[0].getFillLevelInLitres() == litresForCup1
        dispensedCup[0].getCost() == costForCup1
        dispensedCup[1].getCupSize() == mediumCup
        dispensedCup[1].getFillLevelInLitres() == litresForCup2
        dispensedCup[1].getCost() == costForCup2
        dispensedCup[2].getCupSize() == largeCup
        dispensedCup[2].getFillLevelInLitres() == litresForCup3
        dispensedCup[2].getCost() == costForCup3
        dispensedCup[0].getCost() + dispensedCup[1].getCost() + dispensedCup[2].getCost() == expectedTotalCost

    }

    def 'when_requesting_10_litres_cost_is(11)'(){

        given:
        def binaryCups = new BinaryCups()
        def litresForCup1 = 2
        def litresForCup2 = 3
        def litresForCup3 = 5
        def smallCup = 'small'
        def mediumCup = 'medium'
        def largeCup = 'extra-large'
        def costForCup1 = 1
        def costForCup2 = 2
        def costForCup3 = 8
        def cup1 = new Cup(smallCup, litresForCup1, costForCup1)
        def cup2 = new Cup(mediumCup, litresForCup1, costForCup1)
        def cup3 = new Cup(largeCup, litresForCup2, costForCup2)
        def expectedTotalCost = 11
        def requestedLitres = 10

        when:
        def dispensedCup = binaryCups.dispense(requestedLitres)

        then:
        dispensedCup[0].getCupSize() == smallCup
        dispensedCup[0].getFillLevelInLitres() == litresForCup1
        dispensedCup[0].getCost() == costForCup1
        dispensedCup[1].getCupSize() == mediumCup
        dispensedCup[1].getFillLevelInLitres() == litresForCup2
        dispensedCup[1].getCost() == costForCup2
        dispensedCup[2].getCupSize() == largeCup
        dispensedCup[2].getFillLevelInLitres() == litresForCup3
        dispensedCup[2].getCost() == costForCup3
        dispensedCup[0].getCost() + dispensedCup[1].getCost() + dispensedCup[2].getCost() == expectedTotalCost

    }

    def 'when_requesting_11_litres_cost_is(13)'(){

        given:
        def binaryCups = new BinaryCups()
        def litresForCup1 = 2
        def litresForCup2 = 4
        def litresForCup3 = 5
        def smallCup = 'small'
        def largeCup = 'large'
        def extraLargeCup = 'extra-large'
        def costForCup1 = 1
        def costForCup2 = 4
        def costForCup3 = 8
        def cup1 = new Cup(smallCup, litresForCup1, costForCup1)
        def cup2 = new Cup(largeCup, litresForCup2, costForCup2)
        def cup3 = new Cup(extraLargeCup, litresForCup3, costForCup3)
        def expectedTotalCost = 13
        def requestedLitres = 11

        when:
        def dispensedCup = binaryCups.dispense(requestedLitres)

        then:
        dispensedCup[0].getCupSize() == smallCup
        dispensedCup[0].getFillLevelInLitres() == litresForCup1
        dispensedCup[0].getCost() == costForCup1
        dispensedCup[1].getCupSize() == largeCup
        dispensedCup[1].getFillLevelInLitres() == litresForCup2
        dispensedCup[1].getCost() == costForCup2
        dispensedCup[2].getCupSize() == extraLargeCup
        dispensedCup[2].getFillLevelInLitres() == litresForCup3
        dispensedCup[2].getCost() == costForCup3
        dispensedCup[0].getCost() + dispensedCup[1].getCost() + dispensedCup[2].getCost() == expectedTotalCost

    }

    def 'when_requesting_12_litres_cost_is(14)'(){

        given:
        def binaryCups = new BinaryCups()
        def litresForCup1 = 3
        def litresForCup2 = 4
        def litresForCup3 = 5
        def mediumCup = 'medium'
        def largeCup = 'large'
        def extraLargeCup = 'extra-large'
        def costForCup1 = 2
        def costForCup2 = 4
        def costForCup3 = 8
        def cup2 = new Cup(mediumCup, litresForCup1, costForCup1)
        def cup1 = new Cup(largeCup, litresForCup2, costForCup2)
        def cup3 = new Cup(extraLargeCup, litresForCup3, costForCup3)
        def expectedTotalCost = 14
        def requestedLitres = 12

        when:
        def dispensedCup = binaryCups.dispense(requestedLitres)

        then:
        dispensedCup[0].getCupSize() == mediumCup
        dispensedCup[0].getFillLevelInLitres() == litresForCup1
        dispensedCup[0].getCost() == costForCup1
        dispensedCup[1].getCupSize() == largeCup
        dispensedCup[1].getFillLevelInLitres() == litresForCup2
        dispensedCup[1].getCost() == costForCup2
        dispensedCup[2].getCupSize() == extraLargeCup
        dispensedCup[2].getFillLevelInLitres() == litresForCup3
        dispensedCup[2].getCost() == costForCup3
        dispensedCup[0].getCost() + dispensedCup[1].getCost() + dispensedCup[2].getCost() == expectedTotalCost

    }

    def 'when_requesting_13_litres_cost_is(15)'(){

        given:
        def binaryCups = new BinaryCups()
        def litresForCup1 = 1
        def litresForCup2 = 3
        def litresForCup3 = 4
        def litresForCup4 = 5
        def smallCup = 'small'
        def mediumCup = 'medium'
        def largeCup = 'large'
        def extralargeCup = 'extra-large'
        def costForCup1 = 1
        def costForCup2 = 2
        def costForCup3 = 4
        def costForCup4 = 8
        def cup1 = new Cup(smallCup, litresForCup1, costForCup1)
        def cup2 = new Cup(mediumCup, litresForCup2, costForCup2)
        def cup3 = new Cup(largeCup, litresForCup3, costForCup3)
        def cup4 = new Cup(extralargeCup, litresForCup4, costForCup4)
        def expectedTotalCost = 15
        def requestedLitres = 13

        when:
        def dispensedCup = binaryCups.dispense(requestedLitres)

        then:
        dispensedCup[0].getCupSize() == smallCup
        dispensedCup[0].getFillLevelInLitres() == litresForCup1
        dispensedCup[0].getCost() == costForCup1
        dispensedCup[1].getCupSize() == mediumCup
        dispensedCup[1].getFillLevelInLitres() == litresForCup2
        dispensedCup[1].getCost() == costForCup2
        dispensedCup[2].getCupSize() == largeCup
        dispensedCup[2].getFillLevelInLitres() == litresForCup3
        dispensedCup[2].getCost() == costForCup3
        dispensedCup[3].getCupSize() == extralargeCup
        dispensedCup[3].getFillLevelInLitres() == litresForCup4
        dispensedCup[3].getCost() == costForCup4
        dispensedCup[0].getCost() + dispensedCup[1].getCost() + dispensedCup[2].getCost() + dispensedCup[3].getCost() == expectedTotalCost

}

    def 'when_requesting_14_litres_cost_is(15)'(){

        given:
        def binaryCups = new BinaryCups()
        def litresForCup1 = 2
        def litresForCup2 = 3
        def litresForCup3 = 4
        def litresForCup4 = 5
        def smallCup = 'small'
        def mediumCup = 'medium'
        def largeCup = 'large'
        def extralargeCup = 'extra-large'
        def costForCup1 = 1
        def costForCup2 = 2
        def costForCup3 = 4
        def costForCup4 = 8
        def cup1 = new Cup(smallCup, litresForCup1, costForCup1)
        def cup2 = new Cup(mediumCup, litresForCup2, costForCup2)
        def cup3 = new Cup(largeCup, litresForCup3, costForCup3)
        def cup4 = new Cup(extralargeCup, litresForCup4, costForCup4)
        def expectedTotalCost = 15
        def requestedLitres = 14

        when:
        def dispensedCup = binaryCups.dispense(requestedLitres)

        then:
        dispensedCup[0].getCupSize() == smallCup
        dispensedCup[0].getFillLevelInLitres() == litresForCup1
        dispensedCup[0].getCost() == costForCup1
        dispensedCup[1].getCupSize() == mediumCup
        dispensedCup[1].getFillLevelInLitres() == litresForCup2
        dispensedCup[1].getCost() == costForCup2
        dispensedCup[2].getCupSize() == largeCup
        dispensedCup[2].getFillLevelInLitres() == litresForCup3
        dispensedCup[2].getCost() == costForCup3
        dispensedCup[3].getCupSize() == extralargeCup
        dispensedCup[3].getFillLevelInLitres() == litresForCup4
        dispensedCup[3].getCost() == costForCup4
        dispensedCup[0].getCost() + dispensedCup[1].getCost() + dispensedCup[2].getCost() + dispensedCup[3].getCost() == expectedTotalCost

    }

}


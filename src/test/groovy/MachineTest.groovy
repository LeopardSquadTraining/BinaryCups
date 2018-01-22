import spock.lang.Specification


class MachineTest extends Specification {

    def "when_requesting_n_litre_cost_is_(cost)"(){

        given:
        def machine = new Machine()

        when:
        def result = machine.getCost(cap)

        then:
        expectedCost == result

        where:
        cap | expectedCost
        1   | 1
        2   | 1
        3   | 2
        4   | 3
        5   | 3
        6   | 5
        7   | 6
        8   | 7
        9   | 7
        10  | 11
        11  | 13
        12  | 14
        13  | 15
        14  | 15
    }

    def "when_requesting_n_litre_the_order_is_(order)"(){

        given:
          def machine = new Machine()

        when:
          def result = machine.getOrder(cap)

        then:
          expectedOrder == result

        where:
          cap | expectedOrder
          1   | ["S": 1]
          2   | ["S": 2]
//          3   | ["M":` 3]
//          4   | [["S":` 2], ["M":` 2]]
//          5   | [["S":` 2], ["M":` 3]]
//          6   | [["S":` 2], ["L":` 4]]
//          7   | [["M":` 3], ["L":` 4]]
//          8   | [["S":` 2], ["M":` 3], ["L":` 3]]
//          9   | [["S":` 2], ["M":` 3], ["L":` 4]]
//          10  | [["S":` 2], ["M":` 3], ["XL":` 5]]
//          11  | [["S":` 2], ["L":` 4], ["XL":` 5]]
//          12  | [["M":` 3], ["L":` 4], ["XL":` 5]]
//          13  | [["S":` 1], ["M":` 3], ["L":` 4], ["XL":` 5]]
//          14  | [["S":` 2], ["M":` 3], ["L":` 4], ["XL":` 5]]
    }



}

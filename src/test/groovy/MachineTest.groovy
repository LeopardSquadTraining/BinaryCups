import spock.lang.Specification


class MachineTest extends Specification {

    def "when_requesting_n_litre_cost_is_(cost)"(){
        given:
        def machine=new Machine()

        when:
        def result=machine.getCost(cap)

        then:
        expectedResult == result


        where:
        cap | expectedResult | expectedCups
        1   | 1              | ["S"]
        2   | 1              | ["S"]
        3   | 2              | ["M"]
        4   | 3              | ["M"]
        5   | 3              | ["M"]
        6   | 5              | ["L"]
        7   | 6              | ["S","L"]
        8   | 7              | ["M","L"]
        9   | 7              | ["M","L"]
        10  | 11             | ["S","M","XL"]
        11  | 13             | ["S","L","XL"]
        12  | 14             | ["M","L", "XL"]
        13  | 15             | ["S", "M","L", "XL"]
        14  | 15             | ["S", "M","L", "XL"]
    }




}

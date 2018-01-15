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
        cap | expectedResult
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




}

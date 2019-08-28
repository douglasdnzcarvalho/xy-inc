'use strict'

const Database = use('Database')
const InterestPoint = use('App/Models/InterestPoint')

class InterestPointController {
    /**
     * GET pontos_interesse
     */
    async index({request}) {
        const queryParams = request.get();

        if (queryParams.x && queryParams.y) {
            const consulta = await Database
            .raw('select * from interest_points ip where round(sqrt( pow((ip.x_coordinate - ?), 2) + pow((ip.y_coordinate - ?),2)), 2) <= ?', [queryParams.x, queryParams.y, queryParams.distance])
            
            console.log('consulta:', consulta)

            return consulta;
        } else {
            const interestPoints = await InterestPoint.all()

            return interestPoints.toJSON()
        }
    }

    /**
    * POST pontos_interesse
    */
    async store({ request }) {
        const data = request.only(['name', 'x_coordinate', 'y_coordinate']);

        const interestPoint = await InterestPoint.create(data);

        return interestPoint.toJSON();
    }
}

module.exports = InterestPointController

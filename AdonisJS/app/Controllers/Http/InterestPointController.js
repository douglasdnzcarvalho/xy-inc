'use strict'

const Database = use('Database')
const InterestPoint = use('App/Models/InterestPoint')

class InterestPointController {
    /**
     * GET interest_points
     */
    async index({request}) {
        const queryParams = request.get();

        if (
            (queryParams.x && queryParams.y && queryParams.distance) &&
            (queryParams.x >= 0 && queryParams.y >= 0 && queryParams.distance >= 0)
        ) {
            const query = 'select ip.id, ip.name, ip.x_coordinate, ip.y_coordinate from interest_points ip where sqrt( pow((ip.x_coordinate - ?), 2) + pow((ip.y_coordinate - ?), 2)) <= ?';
            
            const result = await Database.raw(query, [queryParams.x, queryParams.y, queryParams.distance])

            return result.rows
        } else {
            const interestPoints = await InterestPoint.all()

            return interestPoints.toJSON()
        }
    }

    /**
    * POST interest_points
    */
    async store({ request }) {
        const data = request.only(['name', 'x_coordinate', 'y_coordinate']);

        const interestPoint = await InterestPoint.create(data);

        return interestPoint.toJSON();
    }
}

module.exports = InterestPointController

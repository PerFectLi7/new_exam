import { post } from '@/utils/request'

export default {
  getAllLevelEnum: query => post('/api/admin/LevelEnum/getAll')
}

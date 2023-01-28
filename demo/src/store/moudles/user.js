import {login} from '@/api/login'
import {defineStore} from "pinia";


const useUserStore = defineStore(
    'user',
    {
        actions: {
            // 登录
            login(userInfo) {
                const username = userInfo.username.trim();
                const password = userInfo.password;
                return new Promise((resolve, reject) => {
                    login(username, password).then(() => {
                        resolve();
                    }).catch(error => {
                        reject(error);
                    })
                })
            }
        }
    }
)

export default useUserStore

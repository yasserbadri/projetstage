export const isPresetInFavorites=(favorites,restaurant)=>{
    for(let item of favorites){
        if(restaurant.id==item.id){
            return true
        }
    }
    return false;
}
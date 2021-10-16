//値に全角数字が含まれていないか
const isNotIncludedFullWidthNumber = (value) => !/[０-９]/.test(value)

//値が空でないか
const isNotBlank = (value) =>  !!(value || value === 0);

//指定の範囲内か
const isRangeDigits = (value, digits1, digits2) => digits1 <= value.length && value.length <= digits2;

//指定の桁数か
export const isEqualDigits = (value,digits) => value.length === digits

//氏名のバリデーション
export const passedNameValidation = (value) => isNotBlank(value) && isNotIncludedFullWidthNumber(value);

//電話番号のバリデーション
export const passedTelValidation = (value) => {
    //10桁以上か
    const isMore10Digits = isRangeDigits(value, 11, 11)
    return isNotBlank(value) && isMore10Digits;
}

//郵便番号のバリデーション
export const passedPostalValidation = (value) =>{
	//7桁か
    const is7Digits = isEqualDigits(value,7);
    return isNotBlank(value) && is7Digits
    //return isNotBlank(value)
}

//住所のバリデーション
export const passedAddressValidation = (value) => isNotBlank(value);
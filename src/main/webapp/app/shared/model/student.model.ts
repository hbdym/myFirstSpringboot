export interface IStudent {
  id?: number;
  name?: string;
  age?: number;
  teacher?: string;
  sex?: string;
  relationName?: string;
  relationId?: number;
}

export const defaultValue: Readonly<IStudent> = {};

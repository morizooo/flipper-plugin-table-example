import {Panel, ManagedDataInspector, TableBodyRow, createTablePlugin} from 'flipper';

type Row = {
  id: string
  date: string
  json: string
};

type Events = {
  newRow: Row
};

const columns = {
  date: {
    value: 'date',
  },
  json: {
    value: 'json',
  },
};

const columnSizes = {
  date: '15%',
  json: 'flex',
};

function renderSidebar(row: Row) {
  return (
    <Panel floating={false} heading={'Info'}>
      <ManagedDataInspector data={JSON.parse(row.json)} expandRoot={true}/>
    </Panel>
  );
}

function buildRow(row: Row): TableBodyRow {
  return {
    columns: {
      date: {
        value: row.date,
        filterValue: row.date,
      },
      json: {
        value: row.json,
        filterValue: row.json,
      },
    },
    key: row.id,
    copyText: JSON.stringify(row),
    filterValue: `${row.date} ${row.json}`,
  };
}

export default createTablePlugin<Row>({
  method: 'newRow',
  columns,
  columnSizes,
  renderSidebar,
  buildRow,
});
